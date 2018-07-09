/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario;

/**
 *
 * @author Karina Mina <https://github.com/karinamina3>
 */
public class User {

    private int id, level, gold;
    private String user, password;

    public User(int id, String user, String password, int level, int gold) {
        this.id = id;        
        this.user = user;
        this.password = password;
        this.level = level;
        this.gold = gold;
    }
    
    public User(String user, String password, int level, int gold) {        
        this.user = user;
        this.password = password;
        this.level = level;
        this.gold = gold;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", level=" + level + ", gold=" + gold + ", user=" + user + ", password=" + password + '}';
    }
    
}
