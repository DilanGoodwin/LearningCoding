using System;

namespace Inheritance{
    class Publication{
        private string _name;

        public Publication(string name,int pageCount,decimal price){
            _name=name;
            PageCount=pageCount;
            Price=price;
        }

        public int PageCount{
            get;
            set;
        }

        public decimal Price{
            get;
            set;
        }

        public string Name{
            get{
                return _name;
            }
            set{
                if(value==""){
                    throw new ArgumentException("Name cannot be blank");
                }
                _name=value;
            }
        }

        public virtual string GetDescription(){
            return $"{Name}, {PageCount} pages";
        }
    }
}