class DataStream {
public:
     int a=0;
         int b=0;
         int count=0;
    DataStream(int value, int k) {
       
        
       
            a=value;
            b=k;
        
    }
    
    bool consec(int num) {
        if(num!=a)count=0;
        if(num==a)count++;
        return count>=b?1:0;
    }
};

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream* obj = new DataStream(value, k);
 * bool param_1 = obj->consec(num);
 */