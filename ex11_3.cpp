#include<bits/stdc++.h>
using namespace std;
int main(){
    string str;
    cin >> str;
    int oneCnt = 0;
    int zeroCnt = 0;
    
    str[0] == '0' ? zeroCnt++ : oneCnt++;

    for(int i = 1; i < str.length(); i++){
        if(str[i - 1] == '0' && str[i] == '1') oneCnt++;
        else if(str[i - 1] == '1' && str[i] == '0') zeroCnt++;
    }

    int ans = min(oneCnt, zeroCnt);
    cout << ans << "\n";
}