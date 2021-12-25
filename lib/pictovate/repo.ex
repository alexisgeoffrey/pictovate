defmodule Pictovate.Repo do
  use Ecto.Repo,
    otp_app: :pictovate,
    adapter: Ecto.Adapters.Postgres
end
