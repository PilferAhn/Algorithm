#include <iostream>
#include <vector>
using namespace std;

// 9 12
// 1 2
// 1 3 
// 2 3 
// 2 4 
// 2 6 
// 3 7 
// 4 5
// 4 7
// 4 8
// 5 6 
// 7 8 
// 8 9

const int MAX = 100;
int n,m;
vector <int> v[MAX];
bool visited[MAX];

void DFS(int x){
  
  // x부터 시작하여 DFS하여 그 순서를 출력하는 상수.
  // visited 에 방문 기록이 있음. 
  
  visited[x] = true;
  cout << x << " ";
  
  for(int i=0;i<v[x].size();i++){
    int y = v[x][i];
    // x와 y가 연결되어있다.
    
    if(visited[y] == false){
      DFS(y);
    }
    
  }
}


int main(){
  
  cin >> n >> m;
  
  for(int i=0;i<m;i++){
    
    int a,b;
    cin >> a >> b;
    
    v[a].push_back(b);
    v[b].push_back(a);
    
  }
  
  DFS(1);
  
  return 0;
}


// DFS 정확성 증명 / 시간복잡도
// 정확성 증명
// DFS가 정말 순회를 하는가

// 모든 정점을 방문한다. 
// 하나의 정점을 두번 이상 방문하지 않는다. 

// 순회를 한다. 정점을 모두 방문했다. 
