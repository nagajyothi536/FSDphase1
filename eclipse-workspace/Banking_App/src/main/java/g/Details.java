package g;
// THIS PROGRAM GBANK IS THE INTERFACE FOR THE MAIN PROGRAM


import java.rmi.*;

public interface Details extends Remote
{
    public int open(String username,String password,double amount,String adderess,double phone) throws RemoteException;
    public String withdraw(String account_no,String uname,String pwd,int amt) throws RemoteException;
    public String deposit(String account_no,String uname,String pwd,int amt) throws RemoteException;
    public String transfer(String account_no,String uname,String pwd,String tacno,int amt) throws RemoteException;
    public String close(String account_no,String uname,String pass)  throws RemoteException;
    public String balance(String account_no,String uname,String pass) throws RemoteException;
}