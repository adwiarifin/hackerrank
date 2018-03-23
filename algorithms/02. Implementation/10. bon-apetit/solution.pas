var
  n,k,b,i,sum,b2: longint;
  ar: array of longint;

begin
  readln(n,k);
  setlength(ar, n);
  sum := 0;
  for i:=0 to n-1 do
  begin
    read(ar[i]);
    if(i <> k) then
      sum := sum + ar[i];
  end;
  readln(b);
  
  // calc
  b2 := b - sum div 2;
  if(b2 <> 0) then
    writeln(b2)
  else
    writeln('Bon Appetit');
end.