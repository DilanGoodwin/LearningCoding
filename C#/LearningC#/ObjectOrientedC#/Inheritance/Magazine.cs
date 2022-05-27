using System;

namespace Inheritance{
    class Magazine:Publication{
        private string _publisher;
        private int _pageCount;
        private decimal _price;

        public Magazine(string name,string publisher,int pageCount,decimal price):base(name,pageCount,price){
            _publisher=publisher;
        }

        public string Publisher{
            get=>_publisher;
            set=>_publisher=value;
        }
    }
}