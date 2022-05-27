using System;

namespace StringRepresentation{
    class Book{
        public string Name{get; set;}
        public string Author{get; set;}
        public int PageCount{get;}

        public Book(string name,string author,int pages){
            Name=name;
            Author=author;
            PageCount=pages;
        }

        //ToString Method String Representation Object
        public override string ToString(){
            return $"Book: {Name} by {Author}";
            
        }

        //ToString Overloaded Give Different Format Version
        public string ToString(char format){
            if(format=='B'){
                return $"Book: {Name}:{Author}";
            }
            if(format=='F'){
                return $"Book: {Name} by {Author} is {PageCount} pages";
            }
            return ToString();
        }
    }
}