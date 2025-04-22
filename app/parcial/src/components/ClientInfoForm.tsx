import React, { useState } from 'react';
import {
  IonCard,
  IonCardHeader,
  IonCardTitle,
  IonCardContent,
  IonItem,
  IonLabel,
  IonInput
} from '@ionic/react';
//import './ClientInfoForm.css';

const ClientInfoForm: React.FC = () => {
  const [clientData, setClientData] = useState({
    nombre: '',
    telefono: '',
    correo: ''
  });

  const handleChange = (field: string, value: string) => {
    setClientData({ ...clientData, [field]: value });
  };

  return (
    <IonCard className="client-info-form">
      <IonCardHeader>
        <IonCardTitle>Datos del Cliente</IonCardTitle>
      </IonCardHeader>
      <IonCardContent>
        <IonItem>
          <IonLabel position="stacked">Nombre completo</IonLabel>
          <IonInput
            placeholder="Ej. Juan Pérez"
            value={clientData.nombre}
            onIonChange={(e) => handleChange('nombre', e.detail.value!)}
          />
        </IonItem>
        <IonItem>
          <IonLabel position="stacked">Teléfono</IonLabel>
          <IonInput
            type="tel"
            placeholder="Ej. +34 600 123 456"
            value={clientData.telefono}
            onIonChange={(e) => handleChange('telefono', e.detail.value!)}
          />
        </IonItem>
        <IonItem>
          <IonLabel position="stacked">Correo electrónico</IonLabel>
          <IonInput
            type="email"
            placeholder="Ej. correo@ejemplo.com"
            value={clientData.correo}
            onIonChange={(e) => handleChange('correo', e.detail.value!)}
          />
        </IonItem>
      </IonCardContent>
    </IonCard>
  );
};

export default ClientInfoForm;
