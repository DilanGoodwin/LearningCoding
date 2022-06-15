favMovies=["Sandlot","The Lego Movie","Dune"]

print(len(favMovies))

favMovies.append("Iron Man")

print(len(favMovies))
print(favMovies)

favMovies.insert(1,"Batman")

print(favMovies)

del(favMovies[2])

print(favMovies)

#Remove enough items from favMoives until there is only a single item left

del(favMovies[0])
del(favMovies[0])
del(favMovies[0])
print(favMovies)