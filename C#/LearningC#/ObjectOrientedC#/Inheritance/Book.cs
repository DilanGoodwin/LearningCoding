using System;

namespace Inheritance{
    class Book:Publication{
        private string _author;

        public Book(string name,string author,int pageCount,decimal price):base(name, pageCount,price){
            _author=author;
        }

        public string Author{
            get=>_author;
            set=>_author=value;
        }

        public override string GetDescription(){
            return $"{Name} by {Author}, {PageCount} pages";
        }
    }
}