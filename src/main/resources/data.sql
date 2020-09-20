INSERT INTO TBL_CLIENTE (nombre, apellido, dni, telefono , email) VALUES
  ('Manu Manuel', 'Santos Mendez', '74512836', '987654321', 'manuel@gmail.com'),
  ('Juan Carlos', 'Cordova Donesto', '74125896', '963258741', 'juan@outlook.com'),
  ('Paco Diego', 'Pancho Fierro', '78965423', '951478236', 'paco@hotmail.com');

INSERT INTO TBL_PRODUCTO (nombre, precio) VALUES
  ('Monitor I', 1500.00),
  ('Monitor II', 1200.00),
  ('Monitor III', 1100.00),
  ('Monitor IV', 1000.00),
  ('Monitor V', 1300.00),
  ('Monitor VI', 1400.00),
  ('Monitor VII', 1600.00),
  ('Monitor VIII', 1700.00),
  ('Monitor IX', 1800.00);

INSERT INTO TBL_VENTA (idCliente, fecha) VALUES
  (1, TO_DATE('1989-12-09','YYYY-MM-DD')),
  (2, TO_DATE('1989-12-09','YYYY-MM-DD')),
  (3, TO_DATE('1989-12-09','YYYY-MM-DD'));

INSERT INTO TBL_DETALLE_VENTA (idProducto, idVenta) VALUES
  (1, 1),
  (2, 2),
  (3, 3),
  (4, 1),
  (5, 2),
  (6, 3),
  (7, 1),
  (8, 2),
  (9, 3);