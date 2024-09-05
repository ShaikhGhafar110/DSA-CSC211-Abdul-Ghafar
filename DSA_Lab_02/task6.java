package DSA_Lab_02;
import java.util.Arrays;
public class task6 {
public static void main(String[] args) {
int n = 10; 
boolean[] primes = new boolean[n];
Arrays.fill(primes, true);
primes[0] = primes[1] = false;
for (int i = 2; i < n; ++i) {
if(primes[i]) {
for (int j = i + i; j < n; j += i) {
primes[j] = false;}}}
int result=0;
for(int i = 2; i < n; ++i) {
if(primes[i]) {
result++;}}}}
        