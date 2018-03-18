Program solveMeFirst;
function solveMeFirst(num1, num2: integer): integer;
var
   result: integer;
begin
   // Hint: Type result := num1+num2; below 
   result := num1+num2;
   solveMeFirst := result;
end;

var A : integer;
    B : integer;
    Res : integer;
begin
  Readln (A);
  Readln (B);
  Res := solveMeFirst(A,B);
  WriteLn(Res);
end.
