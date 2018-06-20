### Game Of Life Java版
> 宇宙的本质是计算 - Stephen Wolfram
  
该游戏又名 *元胞自动机*

#### Rules
1. "人口过少": 任何活细胞如果活邻居少于2个, 则死掉  
2. "正常": 任何活细胞如果活邻居为2个或3个, 则继续活    
3. "人口过多": 任何活细胞如果活邻居大于3个, 则死掉   
4. "繁殖": 任何死细胞如果活邻居正好是3个, 则活过来    

#### 解题思路
1. 算法部分: 实现核心类GameOfLife  
2. 实现画布类GameOfLifeCanvas, 继承自JPanel  
3. 实现启动类Launcher   
4. 三种基本初始化形态类RolesOfLife    

#### TBD
1. Boundary processing
2. Update UI
3. Init images

