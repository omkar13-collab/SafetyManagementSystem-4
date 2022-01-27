package com.Safety.Service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Safety.DAO.InjuryDAO;
import com.Safety.Model.Injury;
@Service
public class InjuryServiceimpl implements InjuryService{
@Autowired
InjuryDAO dao;
    @Override
    public Injury addInjury(Injury injury) {
        // TODO Auto-generated method stub
    Injury inc=dao.save(injury);
    return inc;
    }
    @Override
    public List<Injury> findallInjury() {
        // TODO Auto-generated method stub
    List<Injury> inc=dao.findAll();
    return inc;
    }
    @Override
    public Optional<Injury> findByInjuryId(int id) {
        // TODO Auto-generated method stub
        return dao.findById(id);
    }
    @Override
    public Injury updateInjury(int injuryId, Injury injury) {
        // TODO Auto-generated method stub
    Injury inc=dao.save(injury);
    return inc;
    }
}