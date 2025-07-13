ALTER TABLE medicos ADD COLUMN ativo BOOLEAN;
UPDATE medicos SET ativo = false;
