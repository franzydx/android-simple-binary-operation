# Layout

## Daftar elemen yang akan dibuat

1. Input bilangan biner dari pengguna 
   
- Button untuk memasukan bilangan biner kesatu

- Button untuk memasukan bilangan biner kedua 

2. Pilihan untuk memilih operasi matematika yang akan digunakan

- opsi 1 adalah penambahan
- opsi kedua untuk pengurangan

3. Output hasil akhir

# Logic

Create variable for data each element 

```
binInput1
binInput2
addButton
subButton
resultView
```

Create a function to test it is a valid biner input

```
checkBinary()
```

Create a function to do the math jobs

- first convert it to decimal values using `Integer.parseInt()`
- then revert to binary value, use `Integer.toBinaryString()`
- done 
