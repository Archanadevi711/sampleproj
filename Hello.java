class solution
{
 int remove(vector <int> &nums)
{
set<int> st;
for(int i=0;i<nums.size;i++)
{
st.insert(nums[i]);
}
int start=0;
for(auto it: st)
{
nums[start++]=it;
}
}