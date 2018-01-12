edge(a,b).
edge(a,c).
edge(b,d).
edge(d,e).
edge(e,a).
edge(c,f).
edge(f,g).
edge(f,e).

path( X, Y ) :- edge( X, Y ).
path( X, Z ) :- edge( X, Y ), path( Y, Z ).
