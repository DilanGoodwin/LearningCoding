using System;

namespace AccessModifiers{
    class Book{
        //Public members/methods accessed other areas
        public string _name;

        //Protected members only accessed class/subclass
        protected string _author;

        //Private default only accessed class itself
        private int _pageCount;

        public Book(string name, string author, int pages){
            _name=name;
            _author=author;
            _pageCount=pages;
        }

        public string GetDescription(){
            return $"{_name} by {_author}";
        }

        //Member variables accessed by methods
        public string GetName(){
            return _name;
        }
        public void SetName(string s){
            _name=s;
        }
        public void SetAuthor(string s){
            _author=s;
        }
        public void SetPageCount(int x){
            _pageCount=x;
        }
    }
}