#include <iostream>
#include <vector>
#include <algorithm>
const int MAX = 100;

using namespace std;

int main(){
  
  vector <int> v[MAX];
  
  int n,m;
  
  cin >> n >> m;
  
  for(int i=0;i<m;i++){
    int a,b;
    
    cin >> a >> b;
    
    v[a].push_back(b);
    v[b].push_back(a);
  }
  
  for(int i=1;i<=n;i++){
    cout << i << "(" << v[i].size() << ") ";
    for(int j=0;j<v[i].size();j++)
    {
      cout << v[i][j] << " ";
    }
    cout << endl;
  }
  
  return 0;
}
