book(illiad, homer, study, 500).
book(c, Richie, study, 150).
book(nt_bible, sams, reference, 480).
book(monty_python, cleese, comedy, 300).

buildLibrary(Lib) :- findall(book(Title, Author, Genre, Size), book(Title, Author, Genre, Size), Lib). buildLibrary(L), leisure (B,L).
findAuthor(X) :- (_, X, _, _).
findTitle(X) :- (_, X, _, _).
findType(X) :- (_, _, X, _).
