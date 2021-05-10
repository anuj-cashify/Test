package encapaslation;

class employee
{
    private int emp_id;
    public void setEmpid(int emp_id1)
    {
        emp_id = emp_id1;
    }
    public  int getEmpId()
    {

        return emp_id;
    }
}
class company {
    public static void main(String[] args) {

        employee e = new employee();
        e.setEmpid(101);
        {
            System.out.println(e.getEmpId());
        }
    }
}
