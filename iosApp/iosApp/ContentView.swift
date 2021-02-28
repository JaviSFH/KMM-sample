import SwiftUI
import shared

private let validator = Validator()

struct ContentView : View {
    
    @State private var emailAddress: String = ""
    @State private var phoneNumber: String = ""
    
    @State private var validationMessage: String = ""
    @State private var isValidationCompleted = false
    
    var body: some View {
        
        VStack {
            WelcomeText()
            TextField("Phone number", text: $phoneNumber)
                .keyboardType(.numberPad)
                .padding()
                .cornerRadius(5.0)
                .padding(.bottom, 20)
            TextField("Email address", text: $emailAddress)
                .padding()
                .cornerRadius(5.0)
                .padding(.bottom, 20)
            Button(action: {validateForm()}) {
                LoginButtonContent()
            }
            .alert(isPresented: $isValidationCompleted) {
                Alert(title: Text(validationMessage),
                      dismissButton: .default(Text("OK")))
            }
        }
        .padding()
    }
    
    fileprivate func validateForm() {
        let isEmailValid = validator.validateEmailAddress(email: emailAddress)
        let isPhoneNumberValid = validator.validatePhoneNumber(phoneNumber: phoneNumber)
        
        if (isEmailValid && isPhoneNumberValid) {
            validationMessage = "Fields are valid"
        } else {
            validationMessage = "Fields are not valid"
        }
        
        isValidationCompleted = true
    }
}

#if DEBUG
struct ContentView_Previews : PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
#endif

struct WelcomeText : View {
    var body: some View {
        return Text("Sign Up with " + Platform().platform)
            .fontWeight(.semibold)
            .padding(.bottom, 20)
    }
}

struct LoginButtonContent : View {
    var body: some View {
        return Text("Validate")
            .font(.headline)
            .foregroundColor(.white)
            .padding()
            .frame(width: 220, height: 60)
            .background(Color.gray)
            .cornerRadius(15.0)
    }
}
