:- use_module(library(clpfd)).


sudoku(Rowx) :-
        length(Rowx, 9),
        maplist(same_length(Rowx), Rowx),!,
        append(Rowx, Vs), Vs ins 1..9,
        maplist(all_distinct, Rowx),!,
        transpose(Rowx, Columns),
        maplist(all_distinct, Columns),!,
        Rowx = [As,Bs,Cs,Ds,Es,Fs,Gs,Hs,Is],

        obtenerElemento(As,1,1,P1),
        obtenerElemento(Bs,2,1,P2),
        obtenerElemento(Cs,3,1,P3),

        obtenerElemento(Ds,4,1,P4),
        obtenerElemento(Es,5,1,P5),
        obtenerElemento(Fs,6,1,P6),

        obtenerElemento(Gs,7,1,P7),
        obtenerElemento(Hs,8,1,P8),
        obtenerElemento(Is,9,1,P9),

        Lista=[P1,P2,P3,P4,P5,P6,P7,P8,P9],

        obtenerElemento(As,9,1,Q9),
        obtenerElemento(Bs,8,1,Q8),
        obtenerElemento(Cs,7,1,Q7),

        obtenerElemento(Ds,6,1,Q6),
        obtenerElemento(Es,5,1,Q5),
        obtenerElemento(Fs,4,1,Q4),

        obtenerElemento(Gs,3,1,Q3),
        obtenerElemento(Hs,2,1,Q2),
        obtenerElemento(Is,1,1,Q1),

        Lista2=[Q1,Q2,Q3,Q4,Q5,Q6,Q7,Q8,Q9],
        validarX(Lista,Lista2),
        all_distinct(Lista),
        all_distinct(Lista2),
        blocks(As, Bs, Cs),
        blocks(Ds, Es, Fs),
        blocks(Gs, Hs, Is).


%/randseq(3, 9, Secuencia).
%/append(Rowx, Vs), Vs ins 1..9,

obtenerElemento([_|L],Pos,PosAct,R):-
     Pos =\= PosAct,
     Pos1 is PosAct+1,
     obtenerElemento(L,Pos,Pos1,R).

obtenerElemento([H|_],Pos,PosAct,R):-
     Pos = PosAct,
     label([H]),
     R is H.

blocks([], [], []):-!.

blocks([N1,N2,N3|Ns1], [N4,N5,N6|Ns2], [N7,N8,N9|Ns3]) :-
        all_different([N1,N2,N3,N4,N5,N6,N7,N8,N9]),
        blocks(Ns1, Ns2, Ns3).


validarX([A,B,C,D,_,F,G,H,I|_] ,Lista2):-
     validarPos(A,1,Lista2,1),
     validarPos(A,9,Lista2,1),
     validarPos(B,2,Lista2,1),
     validarPos(B,8,Lista2,1),
     validarPos(C,3,Lista2,1),
     validarPos(C,7,Lista2,1),
     validarPos(D,4,Lista2,1),
     validarPos(D,6,Lista2,1),
     validarPos(F,4,Lista2,1),
     validarPos(F,6,Lista2,1),
     validarPos(G,3,Lista2,1),
     validarPos(G,7,Lista2,1),
     validarPos(H,2,Lista2,1),
     validarPos(H,8,Lista2,1),
     validarPos(I,1,Lista2,1),
     validarPos(I,9,Lista2,1),
     !.

validarPos(Num,Pos,[_|X],PosAct):-
     Pos =\= PosAct,
     Pos1 is PosAct+1,
     validarPos(Num,Pos,X,Pos1).

validarPos(Num,Pos,[L|_],PosAct):-
     Pos = PosAct,
     Num =\= L,!.

validarPos(Num,Pos,[L|_],PosAct) :-
     Pos = PosAct,
     Num = L,fail.

pistasSudokuX(R):-
     generaPosiciones(2,A1),
     generaPosiciones(2,A2),
     generaPosiciones(2,A3),

     generaPosiciones(2,A4),
     generaPosiciones(2,A5),
     generaPosiciones(2,A6),

     generaPosiciones(2,A7),
     generaPosiciones(2,A8),
     generaPosiciones(2,A9),
     R=[A1,A2,A3,A4,A5,A6,A7,A8,A9].


generaPosiciones(Y,R):-
     randseq(Y,9,R).



tablero1(1, P) :-
        P = [[8,_,_,4,6,7,_,5,2],
             [7,4,6,_,3,_,_,_,_],
             [5,_,3,_,9,_,_,_,_],
             [3,_,8,6,_,_,9,_,_],
             [_,_,_,2,_,_,_,8,3],
             [2,7,4,3,8,_,_,6,1],
             [6,_,_,1,_,8,2,_,9],
             [1,8,_,_,5,3,4,_,6],
             [_,3,9,7,2,6,8,_,5]],!.

tablero2(2, P) :-
        P = [[_,5,1,_,_,_,9,7,8],
             [_,_,6,1,_,_,_,_,4],
             [_,_,7,5,_,9,_,6,_],
             [_,7,3,2,8,6,4,_,1],
             [_,1,2,4,5,_,8,9,3],
             [5,_,_,9,3,1,6,_,7],
             [8,_,_,7,_,2,_,1,5],
             [1,_,_,3,_,4,_,8,_],
             [7,_,9,_,_,5,_,4,_]],!.

tablero3(3, P) :-
        P = [[6,_,5,_,_,3,9,_,_],
             [_,9,3,_,_,_,5,7,2],
             [4,2,_,_,_,_,1,3,_],
             [_,_,9,8,_,_,_,4,3],
             [_,6,_,_,3,9,_,_,5],
             [3,4,_,_,7,2,8,6,9],
             [7,3,2,1,6,_,4,9,8],
             [1,8,6,2,9,_,_,5,_],
             [_,_,_,_,_,_,6,2,1]],!.

tablero4(4, P) :-
        P = [[_,_,1,_,6,_,_,4,9],
             [2,_,6,_,1,9,_,_,5],
             [_,9,_,_,7,_,_,6,_],
             [_,6,_,3,_,_,_,2,7],
             [_,2,9,_,_,7,3,8,_],
             [7,_,3,_,2,_,9,_,_],
             [_,4,7,6,_,2,1,_,3],
             [3,1,2,_,5,_,_,9,8],
             [6,5,8,_,3,1,4,7,2]],!.

tablero5(5, P) :-
        P = [[_,_,4,7,2,_,_,8,9],
             [4,_,_,6,_,1,_,5,2],
             [_,_,7,_,9,8,4,1,3],
             [6,_,_,1,_,_,9,_,4],
             [5,3,4,7,_,_,2,6,_],
             [_,7,9,2,_,_,_,_,_],
             [_,_,_,_,1,7,5,_,_],
             [8,_,5,9,4,6,_,2,7],
             [_,4,_,8,2,5,1,_,6]],!.

tablero6(6, P) :-
        P = [[1,_,4,_,_,3,6,9,8],
             [_,_,3,_,_,6,_,_,5],
             [5,_,_,1,_,4,7,_,_],
             [_,_,6,5,_,_,_,8,7],
             [_,_,7,6,3,_,5,1,2],
             [8,_,5,9,_,_,4,3,_],
             [_,_,1,8,6,5,2,7,9],
             [7,_,_,4,_,_,3,_,1],
             [6,9,_,3,7,1,8,_,_]],!.
tablero7(7, P) :-
        P = [[2,9,7,_,8,_,4,_,3],
             [1,_,5,_,_,6,_,7,_],
             [_,_,4,_,_,_,8,5,1],
             [_,6,_,_,_,_,7,_,8],
             [_,4,_,5,_,8,1,9,2],
             [_,_,_,_,4,7,_,3,6],
             [8,_,1,6,5,3,9,2,_],
             [_,_,_,8,_,4,_,1,_],
             [4,2,6,9,7,_,3,8,5]],!.

tablero8(8, P) :-
        P = [[_,9,4,3,_,7,_,_,6],
             [_,2,_,8,_,_,_,_,5],
             [8,_,5,2,_,9,3,_,_],
             [3,_,2,_,_,_,_,6,_],
             [9,5,6,1,7,_,_,_,4],
             [4,1,_,_,6,3,_,2,9],
             [_,3,1,4,_,8,6,7,_],
             [6,8,_,_,_,5,1,_,3],
             [2,4,7,6,_,_,9,5,_]],!.

tablero9(9, P) :-
        P = [[_,2,_,_,_,_,_,3,4],
             [_,8,_,_,_,5,2,1,_],
             [1,_,5,_,4,2,_,_,6],
             [2,7,1,_,6,_,_,_,_],
             [_,6,_,5,2,9,1,4,7],
             [5,_,4,8,_,1,_,_,2],
             [7,4,9,_,_,8,_,2,_],
             [_,_,3,2,9,_,_,7,1],
             [6,1,_,7,5,4,8,_,3]],!.

tablero10(10,P) :-
        P = [[_,3,_,_,2,5,9,6,_],
             [7,2,5,_,_,8,_,_,1],
             [_,6,_,_,3,1,7,_,_],
             [_,7,6,_,_,9,_,_,_],
             [4,5,3,8,_,2,1,_,7],
             [9,8,_,5,7,_,2,3,6],
             [_,_,_,9,5,_,8,1,3],
             [5,1,8,2,_,_,_,_,_],
             [3,9,7,_,8,_,_,_,5]],!.
















