using System;

namespace ChallengeBank{
    class Banking{
        private string _firstName;
        private string _lastName;
        
        public Banking(string firstName,string lastName,decimal startingAmount){
            _firstName=firstName;
            _lastName=lastName;
            Balance=startingAmount;
        }

        public string AccountOwner{
            get=>$"{_firstName} {_lastName}";
        }

        public decimal Balance{
            get; set;
        }

        public void Deposit(decimal x){
            Balance+=x;
        }
        public virtual void Withdraw(decimal x){
            Balance-=x;
        }
    }
}