package org.iata.service.impl;

import org.iata.cargo.model.Event;
import org.iata.model.LogisticsObject;
import org.iata.repository.LogisticsObjectsRepository;
import org.iata.service.LogisticsObjectsService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class LogisticsObjectsServiceImpl implements LogisticsObjectsService {

  private final LogisticsObjectsRepository logisticsObjectsRepository;

  @Inject
  public LogisticsObjectsServiceImpl(LogisticsObjectsRepository logisticsObjectsRepository) {
    this.logisticsObjectsRepository = logisticsObjectsRepository;
  }

  @Override
  public void addLogisticsObject(LogisticsObject logisticsObject) {
    logisticsObjectsRepository.save(logisticsObject);
  }

  @Override
  public LogisticsObject findById(String id) {
    return logisticsObjectsRepository.findById(id).orElse(null);
  }

  @Override
  public List<LogisticsObject> findByCompanyId(String companyId) {
    return logisticsObjectsRepository.findByCompanyId(companyId);
  }

  @Override
  public void updateLogisticsObject(LogisticsObject logisticsObject) {
    logisticsObjectsRepository.save(logisticsObject);
    // TODO Use JSON-LD PATCH
  }

  @Override
  public void addEvent(String loId, Event event) {

  }

  @Override
  public List<Event> findEvents(String loId) {
    return  null;
        //logisticsObjectsRepository.findById(loId)
       // .map(logisticsObject -> logisticsObject.getEvents())
       // .orElse(null);
  }

}
