package com.Safety.DAO;
import org.springframework.data.jpa.repository.JpaRepository;
import com.Safety.Model.Injury;
public interface InjuryDAO extends JpaRepository<Injury,Integer>
{
}