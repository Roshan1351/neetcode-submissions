class Solution {
public:
    int calPoints(vector<string>& operations) {
        vector<int> record;
        for(string ch: operations){
            if(ch=="+"){
                int n= record.size()-1;
                record.push_back(record[n]+record[n-1]);
            }else if(ch=="D"){
                int n= record.size()-1;
                record.push_back(record[n]*2);
            }else if(ch=="C"){
                record.pop_back();
            }else{
                int num= stoi(ch);
                record.push_back(num);
            }
        }
        int sum= 0;
        for(int i= 0; i<record.size(); i++){
            sum+= record[i];
        }
        return sum;
    }
};