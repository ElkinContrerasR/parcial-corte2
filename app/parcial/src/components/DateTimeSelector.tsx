// src/components/DateTimeSelector.tsx
import React from 'react';
import { IonCard, IonCardHeader, IonCardTitle, IonDatetime, IonCardContent, IonLabel } from '@ionic/react';
import './DateTimeSelector.css';

const DateTimeSelector: React.FC = () => {
  return (
    <IonCard className="date-time-selector">
      <IonCardHeader>
        <IonCardTitle>Selecciona Fecha y Hora</IonCardTitle>
      </IonCardHeader>
      <IonCardContent>
        <IonLabel position="stacked">Fecha y hora</IonLabel>
        <IonDatetime
          presentation="date-time"
          min={new Date().toISOString()}
          hourCycle="h23"
          showDefaultButtons
        />
      </IonCardContent>
    </IonCard>
  );
};

export default DateTimeSelector;
