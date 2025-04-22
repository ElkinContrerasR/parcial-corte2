import React, { useState } from 'react';
import {
  IonCard,
  IonCardHeader,
  IonCardTitle,
  IonCardContent,
  IonItem,
  IonLabel,
  IonSelect,
  IonSelectOption
} from '@ionic/react';
import './TableSelector.css';

const mesasDisponibles = [
  { id: 'M1', nombre: 'Mesa 1 (2 personas)' },
  { id: 'M2', nombre: 'Mesa 2 (4 personas)' },
  { id: 'M3', nombre: 'Mesa 3 (6 personas)' },
  { id: 'M4', nombre: 'Mesa 4 (VIP)' }
];

const TableSelector: React.FC = () => {
  const [mesaSeleccionada, setMesaSeleccionada] = useState<string>();

  return (
    <IonCard className="table-selector">
      <IonCardHeader>
        <IonCardTitle>Selecciona la Mesa</IonCardTitle>
      </IonCardHeader>
      <IonCardContent>
        <IonItem>
          <IonLabel>Mesa disponible</IonLabel>
          <IonSelect
            placeholder="Escoge una mesa"
            value={mesaSeleccionada}
            onIonChange={e => setMesaSeleccionada(e.detail.value)}
          >
            {mesasDisponibles.map((mesa) => (
              <IonSelectOption key={mesa.id} value={mesa.id}>
                {mesa.nombre}
              </IonSelectOption>
            ))}
          </IonSelect>
        </IonItem>
      </IonCardContent>
    </IonCard>
  );
};

export default TableSelector;
