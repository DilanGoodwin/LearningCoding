using System;

namespace ChallengeBank{
    class CheckingAcct:Banking{
        public CheckingAcct(string firstName,string lastName, decimal startingAmount):base(firstName,lastName,startingAmount){}

        public override void Withdraw(decimal x){
            decimal currentBalance=Balance;

            if((currentBalance-x)<0){
                Balance-=x+35.00m;
            }else{
                base.Withdraw(x);
            }
        }
    }
}