:- public( [ edge/2, path/2 ] ).

:- include( 'graph.pl' ).

%
% path(X,Y,P,N) holds if there exists a directed path P of length at most N
% from X to Y.
%
path(X,Y,[X,Y],N) :-
   N > 0, 
   edge(X,Y).
path(X,Z,[X|P1],N) :- 
   N > 0,
   N1 is N-1,
   path(Y,Z,P1,N1),
   edge(X,Y), 
   nonmember(X,P1).

nonmember(X,[]).
nonmember(X,[U|Y]) :- X \= U, nonmember(X,Y).
