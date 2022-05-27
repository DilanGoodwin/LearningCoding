using System;

namespace ChallengeBank{
    class SavingsAcct:Banking{
        private decimal _interest;
        private int _numberTimesWithdraw=0;
        public SavingsAcct(string firstName,string lastName,decimal interest,decimal startingAmount):base(firstName,lastName,startingAmount){
            _interest=interest;
        }

        public override void Withdraw(decimal x){
            decimal currentBalance=Balance;

            if((currentBalance-x)<0){
                Console.WriteLine("Error");
            }else{
                _numberTimesWithdraw++;
                if(_numberTimesWithdraw>3){
                    base.Withdraw(x+2.00m);
                }else{
                    base.Withdraw(x);
                }
            }
        }

        public void ApplyInterest(){
            Balance=Balance*(_interest+1.00m);
        }
    }
}