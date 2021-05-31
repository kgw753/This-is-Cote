#include<bits/stdc++.h>
using namespace std;
int main(){
    int N;
    cin >> N;
    vector<int> coins;
    
    for(int i = 0; i < N; i++){
        int coin;
        cin >> coin;
        coins.push_back(coin);
    }

    sort(coins.begin(), coins.end());

    int check = 1;
    for(int i = 0; i < N; i++){
        if(check > coins[i]) break;
        check += coins[i];
    }

    cout << check << "\n";
}