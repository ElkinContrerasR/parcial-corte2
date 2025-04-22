// src/pages/GestionReservas.tsx
import React from 'react';
import { IonPage, IonHeader, IonToolbar, IonTitle, IonContent } from '@ionic/react';
import DateTimeSelector from '../components/DateTimeSelector';
import ClientInfoForm from '../components/ClientInfoForm';
import TableSelector from '../components/TableSelector';

const GestionReservas: React.FC = () => {
  return (
    <IonPage>
      <IonHeader>
        <IonToolbar>
          <IonTitle>Gestión de Reservas</IonTitle>
        </IonToolbar>
      </IonHeader>
      <IonContent className="ion-padding">
        <DateTimeSelector/>
        <ClientInfoForm/>
        <TableSelector/>
        
      </IonContent>
    </IonPage>
  );
};

export default GestionReservas;
