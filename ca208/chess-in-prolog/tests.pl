%:- include('chess3.pl').
%:- include('chess2.pl').
%:- include('chess1.pl').
:- include('chess.pl').

test1(P) :-
   path( (1,1), (5,2) ,5, P).

test2(P) :-
   path( (1,1), (3,3), 10, P).

test3(P) :-
   shortest( (1,1), (5,2) ,P).

test4(P) :-
   shortest( (1,1), (3,3), P).

test5(P) :-
   visit( (1,1), P, 10 ).

test6(P) :-
   visit( (1,1), P, 24 ).
