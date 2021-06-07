#include<bits/stdc++.h>
using namespace std;
int main(){
    int N, M;
    cin >> N >> M;
    vector<int> balls(N + 1, 0);
    for(int i = 0; i < N; i++){
        int w;
        cin >> w;
        balls[w]++;
    }

    int res = 0;
    for(int i = 0; i < M; i++){
        N -= balls[i];
        res += balls[i] * N;
    }

    cout << res << "\n";
}