package com.Safety.Service;

import java.util.List;
import java.util.Optional;
import com.Safety.Model.Injury;

//import net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional;

public interface InjuryService {
Injury addInjury(Injury injury);
List<Injury> findallInjury();
Optional<Injury> findByInjuryId(int injuryId);
Injury updateInjury(int injuryId,Injury injury);
}
