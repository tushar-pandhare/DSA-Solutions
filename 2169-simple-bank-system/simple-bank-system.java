class Bank {

    long b[];
    public Bank(long[] balance) {
        b=balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(!checkPos(account1) || !checkPos(account2)) return false;
        if(!withdraw(account1,money)) return false;
        return deposit(account2,money);
    }
    
    public boolean deposit(int account, long money) {
        if(!checkPos(account)) return false;
        b[account-1]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!checkPos(account)) return false;
        if(b[account-1]<money) return false;
        b[account-1]-=money;
        return true;
    }
    
    public boolean checkPos(int account){
        return account>=1 && account<=b.length;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */