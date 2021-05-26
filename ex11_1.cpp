#include<bits/stdc++.h>
using namespace std;
int main(){
    int N;
    vector<int> horror;
    cin >> N;
    for(int i = 0; i < N; i++) {
        int x;
        cin >> x; 
        horror.push_back(x);
    }

    sort(horror.begin(), horror.end());
    
    int i = 0;
    int ans = 0;
    int cnt = 0;
    
    while(i < N){
        cnt++;
        if(cnt >= horror[i]){
            ans++;
            cnt = 0;
        }
        i++;
    }

    cout << ans << "\n";
}