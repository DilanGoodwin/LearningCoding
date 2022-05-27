using System;

namespace Defining{
    public class Book{
        //Class Member Variables
        string _name;
        string _author;
        int _pageCount;

        //Class Constructors
        public Book(string name, string author, int pages){
            _name=name;
            _author=author;
            _pageCount=pages;
        }

        //Class Methods
        public string GetDescription(){
            return $"{_name} by {_author}";
        }

    }
}