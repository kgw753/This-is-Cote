#include<bits/stdc++.h>
using namespace std;
int main(){
    string str;
    cin >> str;
    int value = str[0] -'0';
    
    for(int i = 1; i < str.length(); i++){
        int now = str[i] - '0';
        value = max(value + now, value * now);
    }
    cout << value << "\n";
}