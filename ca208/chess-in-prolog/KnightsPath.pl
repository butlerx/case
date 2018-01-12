
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


% Write a relation knightpath(Path), where Path is a list of the squares such that, given 2 adjacent elements of the list Si and Si+1, a knight could validly move from Si to Si+1
knightpath([_ / _, []]).
knightpath([Sx / Sy, [Ex / Ey|W]]) :- move([Sx / Sy, Ex / Ey]), knightpath([Ex / Ey, W]).
knightpath([Sx / Sy, Ex / Ey|W]) :- move([Sx / Sy, Ex / Ey]), knightpath([Ex / Ey, W]), !.

% knightjourney(Start, End, L, Path) is true if there is a valid Path of length L from square Start to square End.
knightjourney(Sx / Sy, Ex / Ey ,L,([_ / _, []])) :-
	knightjourney([_ / _, []]).
	knightjourney([Sx / Sy, [Ex / Ey|W]]) :- move([Sx / Sy, Ex / Ey]), knightpath([Ex / Ey, W]).
	knightjourney([Sx / Sy, Ex / Ey|W]) :- move([Sx / Sy, Ex / Ey]), knightpath([Ex / Ey, W]), !.

% knightpassthru(Path, Sq, N) is true if the square Sq is the N-th element of edge.
