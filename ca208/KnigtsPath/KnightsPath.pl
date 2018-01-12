%Cian Butler 13373596
move( [X1/Y1 ,  X2/Y2] ) :- up1( X1, X2 ), up2( Y1, Y2 ).
move( [X1/Y1 ,  X2/Y2] ) :- up2( X1, X2 ), up1( Y1, Y2 ).
move( [X1/Y1 ,  X2/Y2] ) :- up1( X1, X2 ), down2( Y1, Y2 ).
move( [X1/Y1 ,  X2/Y2] ) :- up2( X1, X2 ), down1( Y1, Y2 ).
move( [X1/Y1 ,  X2/Y2] ) :- down1( X1, X2 ), up2( Y1, Y2 ).
move( [X1/Y1 ,  X2/Y2] ) :- down2( X1, X2 ), up1( Y1, Y2 ).
move( [X1/Y1 ,  X2/Y2] ) :- down1( X1, X2 ), down2( Y1, Y2 ).
move( [X1/Y1 ,  X2/Y2] ) :- down2( X1, X2 ), down1( Y1, Y2 ).
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
%append, prefix and suffix function are sourced from www.learnprolognow.org
append([],L,L).
append([H|T],L2,[H|L3])  :- append(T,L2,L3).
prefix(P,L) :- append(P,_,L).
suffix(S,L) :- append(_,S,L).

leng([], 0).
leng([_|T], N) :- leng(T, X), N is X + 1.

% Write a relation knightpath(Path), where Path is a list of the squares such that, given 2 adjacent elements of the list Si and Si+1, a knight could validly move from Si to Si+1
knightpath([_ / _, []]).
knightpath([Start, [End|W]]) :- move([Start, End]), knightpath([End, W]).
knightpath([Start, End|W]) :- move([Start, End]), knightpath([End, W]), !.

% knightjourney(Start, End, L, Path) is true if there is a valid Path of length L from square Start to square End.
knightjourney(Start, End, L, Path) :-
  (append([Start], Path, P), append(P, [End], P1)),
  leng(P1, L),
  knightpath(P1).

% knightpassthru(Path, Sq, N) is true if the square Sq is the N-th element of edge.
knightpassthru(Path, Sq, N) :-
  knightpassthru(Path, Sq, 0, N).
knightpassthru([Sq|_], Sq, N, N).
knightpassthru([_|T], Sq, Acc, N) :-
    Acc1 is Acc + 1,
    knightpassthru(T, Sq, Acc1, N).
