package chapter6.patterns.behavioral

sealed class AuthorizationState

class SignedUpState: AuthorizationState()

class ProfileCompletedState: AuthorizationState()

class UnauthorizedState: AuthorizationState()

class AuthorizationContext {
    var state: AuthorizationState = UnauthorizedState()

    fun signUp() {
        state = SignedUpState()
    }

    fun completeProfile() {
        state = ProfileCompletedState()
    }

    fun display() = when (state) {
            is UnauthorizedState -> println("Display sign up screen")
            is SignedUpState -> println("Display complete profile screen")
            is ProfileCompletedState -> println("Display main screen")
        }

    override fun toString(): String {
        return "AuthorizationContext(state=$state)"
    }
}

fun main(args: Array<String>) {
    val context = AuthorizationContext()
    context.display()
    context.signUp()
    println(context)
    context.display()
    context.completeProfile()
    println(context)
}