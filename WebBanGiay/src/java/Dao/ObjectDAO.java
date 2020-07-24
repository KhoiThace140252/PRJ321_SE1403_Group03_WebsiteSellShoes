/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author Admin
 */
public interface ObjectDAO {

   
    /**
     * Interface add
     *
     * @param obj doi tuong can add
     * @return false neu add that bai
     */
    default boolean add(Object obj) { //các lớp con có thể implement cho tiện, không cần thiết phải show hết
        return false;
    }

    /**
     * Interface edit
     *
     * @param id dung de update bang id
     * @param obj doi tuong can update
     * @return false neu add that bai
     */
    default boolean edit(String id, Object obj) {
        return false;
    }

    /**
     * Interface del
     *
     * @param id de xoa mot yeu cau nao do bang id
     * @return false neu add that bai
     */
    default boolean del(String id) {
        return false;
    }
}
