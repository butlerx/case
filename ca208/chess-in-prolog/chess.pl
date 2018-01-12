%
% move1( (X1,Y1), (X2,Y2) ) holds if a Knight can move in one step from
% (X1,Y1) to (X2,Y2) on a 8x8 chess board
%
move1( X1/Y1 ,  X2/Y2 ) :- up1( X1, X2 ), up2( Y1, Y2 ).
move1( X1/Y1 ,  X2/Y2 ) :- up2( X1, X2 ), up1( Y1, Y2 ).
move1( X1/Y1 ,  X2/Y2 ) :- up1( X1, X2 ), down2( Y1, Y2 ).
move1( X1/Y1 ,  X2/Y2 ) :- up2( X1, X2 ), down1( Y1, Y2 ).
move1( X1/Y1 ,  X2/Y2 ) :- down1( X1, X2 ), up2( Y1, Y2 ).
move1( X1/Y1 ,  X2/Y2 ) :- down2( X1, X2 ), up1( Y1, Y2 ).
move1( X1/Y1 ,  X2/Y2 ) :- down1( X1, X2 ), down2( Y1, Y2 ).
move1( X1/Y1 ,  X2/Y2 ) :- down2( X1, X2 ), down1( Y1, Y2 ).

up1( U, V ) :- successor( U, V ).
up2( U, W ) :- successor( U, V ), successor( V, W ).
down1( U, V ) :- up1( V, U ).
down2( U, V ) :- up2( V, U ).

successor( 1, 2 ).
successor( 2, 3 ).
successor( 3, 4 ).
successor( 4, 5 ).
successor( 5, 6 ).
successor( 6, 7 ).
successor( 7, 8 ).

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

%
% path(X,Y,P,N) holds if there exists a directed path P of length at most N
% from X to Y.
%
path(X,Y,[X,Y],N) :-
   N > 0,
   path(X,Y).
   path(X,Z,[X|P1],N) :-
      N > 0,
      N1 is N-1,
      path(Y,Z,P1,N1),
      move1(X,Y),
      nonmember(X,P1).

nonmember(X,[]).
nonmember(X,[U|Y]) :- X \= U, nonmember(X,Y).
