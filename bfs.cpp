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

#include <iostream>
#include <vector>
#include <queue>
using namespace std;

int n,m;

const int MAX = 100;

vector <int> v[MAX];

// 간선과 점선 
void bfs(int x){
  
  // 시작점을 quere에 삽입한다
  // 시작점을 색칠한다
  
  // bfs start
  
  // 3. quere 에서 하나를 뺸다. 빼는 장소가 node의 위치이다. 
  // 4. 인접한 모든 정점에게 방문했는지 물어보고 
  //  false면 색칠하고 큐에 삽입한다
  // 5. 모두 완료했다면 다시 3번으로 돌아간다. 
  
  bool check[MAX] = {0,}; // check가 true면 이미 다녀감. 
  queue <int> Quere;
  
  // Queue 
  // push 삽입
  // pop 맨 앞에 있는 원소를 제거 
  // front 맨 앞에 있는 원소를 반환 
  
  // empty --> 비었으면 true를 반환. 
  
  
  Quere.push(1);
  check[1] = true;
  
  while(!Quere.empty()){
    
    // if(Queue.empty()) break;
    
    int current = Quere.front();
    Quere.pop();
    cout << current << " ";
    //현제 위치는 current안에 있음
    
    for(int i=0;i<v[current].size(); i++){
      int next = v[current][i];
      
      if(check[next] == false){
        check[next] = true;
        Quere.push(next);
      }
    }
  }
  
}

int main(){
  
  
  cin >> n >> m;
  
  for(int i = 0; i < m; i++){
    int a,b;
    
    v[a].push_back(b);
    v[b].push_back(a);
  }
  
  bfs(1);
  return 0;
}
