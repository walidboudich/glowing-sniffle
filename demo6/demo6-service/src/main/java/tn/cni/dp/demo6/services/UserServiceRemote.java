package tn.cni.dp.demo6.services;

import javax.ejb.Remote;

import tn.cni.dp.demo6.entities.User;
import tn.cni.dp.demo6.utilities.IGenericDAO;

@Remote
public interface UserServiceRemote extends IGenericDAO<User> {

}
