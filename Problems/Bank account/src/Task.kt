class BankAccount(var deposited: Long, var withdrawn: Long) {
    var balance = deposited - withdrawn
}